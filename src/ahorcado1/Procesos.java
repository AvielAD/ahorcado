package ahorcado1;  
  
import java.io.BufferedReader;  
import java.io.File;  
import java.io.FileReader;  
  
public class Procesos {  
      
    static String palabra = "";  
    static String palabraErrada;  
    String mensaje = "";  
    static char letras[];      
    static char letrasErradas[];  
    static int intentosErrados = 0;  
    static int intentosPermitidos = 6;  
    static int cantMaximaCaracteres = 20; //Cantidad maxima de caracteres por palabra  
  
    public void inicializarPalabra () {  
        palabra = "";  
        palabraErrada = "";  
        mensaje = "";  
        intentosErrados = 0;          
          
        try {  
            //Variable para almacenar la cantidad de palabras que hay en el archivo adjunto  
            int contadorPalabras = 0;  
  
            //Obtener la palabra del txt  
            File archivo = new File("palabritas.txt");  
            BufferedReader entrada;  
  
            //En el primer recorrido determinamos cuantas palabras tengo en palabritas  
            entrada = new BufferedReader(new FileReader(archivo));  
            String palabraTemp = "";  
            while(entrada.ready()){  
                palabraTemp = entrada.readLine();  
                if (palabraTemp.length()>cantMaximaCaracteres) continue; //Validamos el tama帽o de caracteres  
                contadorPalabras ++;  
            }  
            System.out.println("Cantidad:"+contadorPalabras);  
  
            //Con la cantidad de palabras realizamos el random  
            //Lo multiplicamos x 100 y agarramos el residuo de dividirlo entre la cantidad de palabras  
            //Le sumamos 1 xq el cero no juega  
            int numeroLineaEscogida = ((int) (Math.random() * 100) % contadorPalabras) + 1;  
  
            //Nos posicionamos en el numero del random y obtenemos la palabra  
            entrada = new BufferedReader(new FileReader(archivo));  
            int numeroLineaActual = 1;  
            while(entrada.ready()){  
                palabraTemp = entrada.readLine();  
                if (palabraTemp.length()>cantMaximaCaracteres) continue; //Validamos el tama帽o de caracteres  
                if ( numeroLineaActual == numeroLineaEscogida ){  
                    palabra = palabraTemp;  
                    break;  
                }else{  
                    numeroLineaActual++;  
                }  
            }  
  
            System.out.println("palabra:"+palabra);  
            // En el arreglo de caracteres que contendra el resultado lo llenamos de espacio  
            letras = new char[palabra.length()];  
            for (int i = 0; i <= palabra.length() - 1; i++) {  
                if ( palabra.substring(i, i+1).equals(" ") ){  
                    letras[i] = ' ';  
                }else{  
                    letras[i] = '_';  
                }  
            }  
  
            //inicializamos el arreglo de intentos errados  
            letrasErradas = new char[intentosPermitidos];  
  
        } catch (Exception e) {  
            e.printStackTrace();  
            mensaje = "No se encuentra el archivo 'palabritas.txt'";  
        }  
    }  
  
    public boolean buscarLetra(char letra) {  
        //Primero determinamos si la letra ingresada existe en algun lugar de la palabra  
        if ( palabra.indexOf(letra,0) == -1 ) {  
            almacenarErrados(letra);  
            return false;  
        }else{  
            //Recorremos toda la palabra para reemeplaza el _ por la letra ingresada  
            int pos = 0;  
            do {  
                pos = palabra.indexOf(letra, pos);  
                if (pos != -1) {  
                    letras[pos] = letra;  
                    pos++;  
                }  
            }  
            while (pos != -1);  
        }  
        return true;  
    }  
  
    public void verificarFin(char letra) {  
  
        if ( palabra.indexOf(letra,0) == -1 ) {  
            if ( intentosErrados == intentosPermitidos ) {  
                mensaje = "PERDISTE, la palabra era: "+palabra;  
            }else{  
                mensaje = "Te quedan "+ new Integer(intentosPermitidos-intentosErrados).intValue() +" intentos";  
            }  
        }  
    }  
  
    public String mostrarJuego() {  
        String resultado = "";  
        for (int i = 0; i <= palabra.length() - 1; i++){  
            resultado = resultado + letras[i] + " ";  
        }  
        return resultado;  
    }  
  
    public String deliberar(String palabraEscrita){  
        if (palabraEscrita.equalsIgnoreCase(palabra))  
            return mensaje = "Felicitaciones, deliberaste y GANASTE!";  
        else  
            return mensaje = "PERDISTE, la palabra era: "+palabra;  
    }  
  
    public void almacenarErrados (char letra){  
        boolean agregarLetraErrada = true;  
  
        //Verificamos si la letra ingresada ya existe, si existe no hacemos nada  
        for (int i = 0; i < letrasErradas.length; i++) {  
            if ( letrasErradas[i] == letra ) {  
                agregarLetraErrada = false;  
            }  
        }  
  
        //Si la letra errada no existe en el arreglo, la agrego  
        if ( agregarLetraErrada ) {  
            letrasErradas[intentosErrados] = letra;  
            intentosErrados++;  
            palabraErrada = palabraErrada + " " + letra;  
            verificarFin(letra);  
        }  
    }  
}  