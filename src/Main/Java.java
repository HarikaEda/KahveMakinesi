package Main;

import java.util.Scanner;

public class Java {static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
    /*

  1. Basit bir Kahve makinesi oluşturun.    3 çeşit kahvemiz olsun.
  2. Sistem şu soruyu sorsun: "Hangi Kahveyi istersiniz?"
  3.Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.
   Örn:
  Hangi Kahveyi İstersiniz?
  1.Türk kahvesi
  2.Filtre Kahve
  3.Espresso

        String hangiKahve oluşturun ve var olan kahvelerden birini yazınız.
         (örn: Türk Kahvesi,  ya da türk kahvesi.  --->  Büyük- küçük harf duyarlı olmaması için String methodu kullanın.)
                                                                                     todo 1. Koşul bölümü
        Eğer kahve Türk kahvesi ise, konsola = Türk kahvesi hazırlanıyor. yazsın.(Dümdüz Türk kahvesi yazmayın. String hangiKahve'yi çağırın!!)
        Eğer filtre kahve ise,   konsola = Filtre kahve hazırlanıyor.  yazsın.     (String hangiKahve'yi kullanın !)
        Eğer Espresso ise, konsola =  Espresso hazırlanıyor...   yazsın.  (String hangiKahve'yi kullanın !)
        Eğer yanlış harf girerseniz, konsola = Hatalı tuşlama yaptınız. yazsın. (Hatalı tuslamadan sonra kod calısmaya devam edecektir, o konuyu daha görmediniz bu yüzden bastan baslatın.)
                                                                                     todo ----------------------------------

        Sistem bize şu soruyu sorsun: "Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):    "   Konsolda aynen böyle  yazmalı. Parantez içi de konsolda olsun.

       String sut olusturun.
                                                                           todo 2.Koşul Bölümü
       eğer String sut,  evet   e eşitse,konsola, Süt ekleniyor... yazısı gelsin.         -- (Büyük küçük harf duyarlı olmaması için String methodu kullanın. Olması gereken ihtimaller: Evet, EVET, EvEt,EVEt vs.

      eğer String sut, hayır a eşit ise, konsola , Süt eklenmiyor  yazısı gelsin.
                                                                                    todo ----------------------------------



        Sistem bize "Şeker ister misiniz ? (Evet veya hayır cevabını veriniz) : " şeklinde bir soru sorsun. (Büyük küçük harf duyarlılıgı olmaması için string method kullanın.
        String seker oluşturunuz.
                                                                todo 3.Koşul Bölümü
        todo if(){
        Eğer String seker   Evet e eşitse ,  sistem bize "Kaç şeker olsun?" sorusunu sormalı. Sorunun altına int kacSeker  oluşturunuz.
        Şeker sayısını giriniz.
        Ve konsola   şunu yazdırınız örnek: 5 şeker ekleniyor.  (ipucu: Bu kodların heosi if bloğunun içerisinde olacak)
        todo }
        todo else{
    Eğer String şeker  hayır 'a eşitse, sistem bize "Şeker eklenmiyor" cevabını versin.


            ONEMLİ !! =   bir int girdisinden sonra String girdisi yapacaksak,araya boş bir nextLine koymamız gerekiyor. (String bosKod = sc.nextLine();    )  dummy kod ekleyiniz.

  Sistem bize "Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.) :   sorusunu sorsun. (büyük küçük harf duyarlılıgı olmamalı. yani kullanıcı büyük boy veya BüYüK Boy girdiginde kabul etmeli.
  String boyut oluşturun...

                                                   todo 4.Koşul Bölümü
        eğer String boyut Büyük boy' a eşitse =  Kahveniz büyük boy hazırlanıyor. (Büyük boy kısmını String boyut'u kullanarak yazalım= "Kahveniz" + boyut + "hazırlanıyor.")

        Eğer String boyut  Orta Boy'a eşitse = Kahveniz orta boy hazırlanıyor.. ("Kahveniz" + boyut + "hazırlanıyor.)

        Eğer String boyut  Küçük boy'a eşitse = Kahveniz küçük boy hazırlanıyor.    yazsın. ("Kahveniz" + boyut + "hazırlanıyor.)




                    //todo  SONUÇ BÖLÜMÜ

                    Siparişlerimizi verdik. Son hali görmek istiyoruz.
                    konsola şunu yazdırın örnek :

        Türk Kahvesi orta boy hazırdır. Afiyet olsun !!! (Türk kahvesi için String hangiKahveyi kullanın.     orta boy için de String boyut ' u kullanın.)


        todo Açıklama :

       Projeyi bilerek biraz zor hazırladık. Üzerinde fazla fazla kafa yormanız ve "grupça çalışmanız için" böyle düzenledik. Yapamayan arkadaşlar kesinlikle canlarını sıkmasın.
       Size çok zor gelebilir. Ancak adım adım ilerlerseniz, grup ile çözerseniz ve yazdığım notları tamamen uygularsanız halledebilirsiniz. Öğrenmediğiniz hiçbir şey yok. Sadece biraz karışık.

       Bir ödev çözümü günü yapacağız. Bunun haberini ilerleyen günlerde size vereceğim.

       Ancak arkadaşlarınızla beraber Voice Channel larda ödev üzerine tartışabilirsiniz.

       HERKESE KOLAY GELSİN !!
                 */
//kahve tercihi... 

//kullanıcıya hangi kahveyi istediği sorulur ve kahve seçenekleri yazdırılır
menuyuYazdır();
 //kullanıcıya hangi kahveyi seçtğiği sorulur ve alınan cevaba göre bir değişkende tutulur.
String kahveSecimi =kahveSecimiyap();

//seçtiği kahveye göre konsola bşlgilendirme mesajı yazdırılır

        System.out.println(kahveSecimi+ "hazırlanıyor");


//yanlış tuşlama yapıldığı taktirde hangi kahveyi istediği tekrar sorulur

//sut ekleme asaması....
sutEklela();


//  Kullanıcıya süt isyteyip istemediği sorulur ve cevap string değişkende saklanır

//kullanıcı evet deiyse süt ekleniyor yazdırılır,hayır ise süt eklenmiyor yazdırılır..


//şeker ekleme....
//kullanıcıya şeker isteyip istemediği sorulur evetse kaç şeker,su kadar(şeker sayısı) seker ekleniyor yazdırılır,cevap hayır ise
 //şeker eklenmiyor yazdırılır.
sekerEkle();

//boy seçim aşaması...
        //Kullanıcıya seçilebilecek boy bilgisi yazdırılı ve seçim yapması beklenir
        //seçim buyuk boy ise kahveniz buyuk boy hazırlanıyor
        // seçim ort boy ise kahveniz orta boy hazırlanıyor
        // seçim küçük boy ise kahveniz küçük boy hazırlanıyor
String boySecimi=boySecimiYap();

//sonuç....
        System.out.println("***"+kahveSecimi +" "+boySecimi+" "+"olarak hazırlanıyor,AFİYET OLSUN :)***");
//kullanıcıya istediği kahve boy bilgileri yazdırılır.
        

    }

    private static String boySecimiYap() {
        System.out.println("*****Hangi boy istersiniz*****");
String boySecimi=input.nextLine();
switch (boySecimi.toLowerCase()){
    case "buyuk boy":
    case "orta boy":
    case "küçük boy":
        System.out.println("Kahveniz " + boySecimi + " hazırlanıyor");
        break;

    default:
        System.out.println("Hatalı giriş yaptınız doğru boy seçimi yapınız");
        boySecimiYap();
}


        return boySecimi;
    }

    private static void sekerEkle() {
        System.out.println("**********Seker eklemek ister misiniz?(Evet veya Hayır olarak cevaplayınız)**********");
        String sekersecimi= input.nextLine();
        if (sekersecimi.equalsIgnoreCase("evet")){
            System.out.println("kaç şeker eklenmesini istersiniz ? ");
            int sekerSayısı= input.nextInt();
            input.nextLine();
            if (sekerSayısı>0){
                System.out.println(sekerSayısı+" şeker ekleniyor");
            }else {
                System.out.println("yanlış girdi yaptınız");
                sekerEkle();
            }
        } else if (sekersecimi.equalsIgnoreCase("hayır")) {
            System.out.println("seker eklenmiyor eklenmiyor");
        }else {
            System.out.println("Hatalı giriş yaptınız ,lütfen evet veya hayır şeklinde cevap veriniz: ");
            sekerEkle();
        }

    }

    private static void sutEklela() {
        System.out.println("**********Süt eklemek ister misiniz?(Evet vya Hayır olarak cevaplayınız)**********");
        String sutsecimi= input.nextLine();
        if (sutsecimi.equalsIgnoreCase("evet")){
            System.out.println("sut ekleniyor");
        } else if (sutsecimi.equalsIgnoreCase("hayır")) {
            System.out.println("sut eklenmiyor");
        }else {
            System.out.println("Hatalı giriş yaptınız ,lütfen evet veya hayır şeklinde cevap veriniz: ");
            sutEklela();
        }
    }

    private static String kahveSecimiyap() {
         //oyle bir method geliştirki kullanıcı doğru tercih yapana kadar methoddan çıkamasın

        while (true){//kullanıcıdan girdi alını ve değişken de saklanır
            String secim= input.nextLine();
            //bu değişkenin eğer kabul edlirse methoddan çıkılır
        if ((secim.equalsIgnoreCase("turk kahvesi"))||
                (secim.equalsIgnoreCase("filtre kahve"))||
                (secim.equalsIgnoreCase("espresso"))){
return secim;
            }else {
            System.out.println("Yanlış seçim yaptınız,lütfen tekrar seçim yapınız");
     menuyuYazdır();

            }


            //değil ise menu tekrardan yazdırılır

        }
    }

    private static void menuyuYazdır() {

        System.out.println("Hangi kahveyi istersiniz ? ");
        System.out.println("1.Türk kahvesi");
        System.out.println("2.Filtre kahve");
        System.out.println("3.Espresso");
        System.out.println("\n*************************************\n\n");
    }
}
