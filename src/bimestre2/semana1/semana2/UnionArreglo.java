package bimestre2.semana1.semana2;

public class UnionArreglo {
    public static void main(String[] args) {
        String marcas1[] = {"hp","dell","assus","lenovo","toshiba"};
        String marcas2[] = {"samsung","huawei","dere"};
        //obtenemos el tamaño del arreglo que se va a crear después (en este caso es 8)
        int tam_arr_resultado = marcas1.length + marcas2.length;
        //copiamos los valores del arreglo marcas1 en el arreglo res
        String res[] = new String[tam_arr_resultado];
        for (int indice = 0; indice < marcas1.length; indice++) {
            res[indice] = marcas1[indice];
        }
        //copiamos los valores del arreglo marcas2 en el arreglo res
        for (int indice = marcas1.length, indice2 = 0; indice < res.length; indice++, indice2++) {
            res[indice] = marcas2[indice2];
        }
        //mostramos todos los elementos del arreglo res
        for (int indice = 0; indice < res.length; indice++) {
            System.out.println(res[indice]);
        }
    }
}
