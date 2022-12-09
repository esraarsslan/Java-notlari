package day18arraylistpassbyvalue;


import java.util.ArrayList;
import java.util.List;

public class C01ArrayLists_01 {
    public static void main(String[] args) {

        //EXP1: //Example 1: Bir Integer ArrayList'teki 7 hariç tüm
        ////           elemanları 2 artırınız

        List<Integer> ages = new ArrayList<>();
        ages.add(12);
        ages.add(7);
        ages.add(21);
        ages.add(78);
        ages.add(9);

        for (Integer w : ages){// listteki elemanlari degistirmek icin setten baska sansiniz yok...
           if(w==7){   //eger w 7 ise bosver onu dicez. degilse 2 arttircaz
           continue;

           }
           //w =w+2; ==> List'ler boyle update edilemezler...setle degistiriler...

            ages.set(ages.indexOf(w), w+2);// ages indexine git w yu bul sonra da onu 2 arttir demek..

        }
        System.out.println(ages);//[14, 7, 23, 80, 11]

      //  EXP2=== size verilen Array listte 8 ve 8'den onceki(inclusive) tum elemanlari 2 katina cikartiniz.'

        List<Integer> nums = new ArrayList<>();
        nums .add(12);
        nums .add(7);
        nums .add(21);
        nums .add(8);
        nums .add(9);

        for (Integer w: nums){
            //nums.set(nums.indexOf(w), w*2);// breakten sonra olsa 8 ve sonrasi degismez. o yuzden 8 de dahil oldugundan breakten sonraya kot=ymaliyiz...

            if (w==8){
                break;
            }
            nums.set(nums.indexOf(w), w*2);
        }
        System.out.println(nums);//[24, 14, 42, 16, 9]
    }

    
}


