package day24statickeywordEncapsilation;

public class Student {

    /*** Interview ****
   1) Encapsulation ==kapsule koymak demek..."data hiding"(gizlemek)
    2)Datayi neden  gizlesiniz?  dis etkenlerden korumak icin
    3) Datayi nasil gizlersin? Access modifierini priva yaparak..
     4) Datayi gizledikten sonra; baska classlardan okumak istersen ne yaparsin?
     cvp=="get" methodlar olusturarak gizledigimiz datalari okunur hale getirebiliriz...
     bu "get" methodlara (getter) da derler.
     mesela ust seviyediki bir insanin hastalik bilgileri... bunu gizlememiz lazim .ama doktorun gormesi lazim.
     Gizlenen seylerin bazen okunmasi gerekir onu da get methodlarla hallederiz.
     5) Datayi gizledikten sonra baska Class'lardan degistrmek istersen naparsin?
     //SET methodlar olusturarak gizledigimiz datalari degistirebiliriz. bunlara (setter) da denir.
     6) VAriable;nin data type ile get methodun return type ayni olmalidir.
     7)Get methodlari isimlendirirken "get + variabla name>" ancak variablenin data tipi "boolean"  ise; "is+variablaname" yapariz.
     8)

     */


        private String stdNAme = " Tom Cruise";// su an datayi gizledik.

        private String stdId = "TC202201";
        private double gpa= 3.8;//(ortalama) =gpa
        private boolean retired = false;



        //*************************
        public String getStdId() {
            return stdId;// sdtId yi ver diyoruz§.
        }

        public double getGpa() {
            return gpa;
        }

        public boolean isRetired() { // booleanlarda "is" ile baslar...
            return retired;
        }


        //******************// setter'larin return type hep void'dir.
        // cunku setter'lar data vermez degisimi yapar ve orada birakir..
    // setler hep set tir boolenanda bile... getler is alirdi boolean da

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }
}



