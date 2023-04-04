package ders16;

enum book { // class gibi düsün.
    ALICE_HARIKA(150,"asafafa"),
    FARELER_VE_INSANLAR(130,"12312312"),
    SEFILLER(199,"asfsasfgggg");
// önce enum'ı parametrelendireceksen attributelarını tanımla ve yapıcı da göster.

    int id;
    String desc;
   book(int id, String desc){
        this.id=id;
        this.desc= desc;
    }

}

public class Main {
    public static void main(String[] args) { // ENUM

    book[] books = book.values();

    for(int i=0 ; i<books.length;i++)
        System.out.println("Kitap adi: "+books[i]+"\nKitap id: "+books[i].id+ "\nKitap yayın evi: "+books[i].desc);

    }
}
