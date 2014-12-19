public class BubbleSort {
    public static void tampilkanData(String nama[],int indeksTerakhir) {
        for(int i=0; i <=indeksTerakhir; i++)
        System.out.println(nama[i]);
    }
    public static void urutkanBubble(String nama[], int indeksTerakhir) {
        String sementara = "";{
        for (int j=0; j <=indeksTerakhir - 1; j++)
        for (int i=0; i<=indeksTerakhir-1-j; i++)


if (nama[i].compareTo(nama[i+1]) > 1){
	sementara = nama[i];
    nama[i] = nama [i+1];
    nama[i+1] = sementara;
            }
}
public static void main(String[] args)
{    String nama [] = {"gina" , "cici" , "beni" , "heru" ,
      "dedi" , "eko" , "feri" , "janu" , "abud" , "iwan"};
    int indeksTerakhir = nama.length - 1;
    System.out.println("Data Sebelum Diurutkan : ");
    tampilkanData(nama,indeksTerakhir);
        System.out.println("");
    System.out.println("Data Setelah Diurutkan : ");
    tampilkanData(nama, indeksTerakhir);    }
}
}