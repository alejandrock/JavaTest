 class OrdenMatriz {    

    private  int [] arrayEnteros;
    private String  tipoOrden  = " ";

    public OrdenMatriz(int [] arrayEnteros, String  tipoOrden){

        this.arrayEnteros = arrayEnteros;
        this.tipoOrden =  tipoOrden;

    }

    private int [] ordenAsc(){         

        int aux = 0;     
        
        if((arrayEnteros != null) && (arrayEnteros.length >= 2)){

            for (int i = 0; i < arrayEnteros.length; i++) {     

              for (int j = i+1; j < arrayEnteros.length; j++) {   

                  if(arrayEnteros[i] > arrayEnteros[j]) {   

                     aux = arrayEnteros[i];    
                     arrayEnteros[i] = arrayEnteros[j];     
                     arrayEnteros[j] = aux;    
                   }     
                }     
            }

            showArray();                  

        } else{

            System.out.println("El tamaño de la lista debe ser mayor a 1" );
        }    
        
        return arrayEnteros;

    }

    private int [] ordenDesc(){         


        if((arrayEnteros != null) && (arrayEnteros.length >= 2)){   

            int aux = 0; 

            for (int i = 0; i < arrayEnteros.length; i++) {     

                for (int j = i+1; j < arrayEnteros.length; j++) {     

                   if(arrayEnteros[i] < arrayEnteros[j]) {    

                       aux = arrayEnteros[i];    
                       arrayEnteros[i] = arrayEnteros[j];    
                       arrayEnteros[j] = aux;    
                   }     
                }     
            }    
                          
            showArray();
        }else{

            System.out.println("El tamaño de la lista debe ser mayor a 1" );
        }

        return arrayEnteros;
    
    }

    private void showArray(){
        
        for (int i = 0; i <arrayEnteros.length; i++) {                 
            System.out.print(arrayEnteros[i] + " ");    
        }    
    }

    public static void main(String[] args) {

        int [] arrayEnteros = new int [] {9,10,1,5,7}; 
        String  tipoOrden = "Desc";  
        OrdenMatriz objOrdenMatriz = new OrdenMatriz(arrayEnteros, tipoOrden); 

        if (tipoOrden == "Asc"){

            objOrdenMatriz.ordenAsc();        
        }
        else if (tipoOrden == "Desc"){ 

            objOrdenMatriz.ordenDesc();        
        }
        else{

            System.out.println("Se debe indicar un tipo de ordenamieto. Asc / Desc" );
        }
    }
}    


  
