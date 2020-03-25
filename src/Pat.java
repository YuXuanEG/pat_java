import java.util.Scanner;

/**
 * Created by EG on 2020/3/25.
 */
public class Pat {
    static void pat_1(){
        System.out.println("1001 A+B Format (20 goals)");
        System.out.println("input 2 integer a,b(-10^-6 <= a,b <= 10^6)");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        System.out.printf("%,d",a+b);
    }

    static void pat_2(){
        System.out.println("1002 A+B for Polynomials (25 goals)");
        float[] arr = new float[1001];
        int count = 0;
        //接收数据
        Scanner scanner = new Scanner(System.in);
        int p1Num = scanner.nextInt();
        for (int i = 0; i < p1Num; i++) {
            int exponents = scanner.nextInt();
            arr[exponents] += scanner.nextFloat();
            count++;
        }
        int p2Num = scanner.nextInt();
        for (int i = 0; i < p2Num; i++) {
            int exponents = scanner.nextInt();
            if (arr[exponents]==0.0) {
                count++;
            }
            arr[exponents] += scanner.nextFloat();
        }
        scanner.close();//接收结束
        //输出
        System.out.print(count);
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] != 0.0) {
                System.out.printf(" %d %.1f",i,arr[i]);
            }
        }

    }

    static void pat_3(){}
    static void pat_4(){}
    static void pat_5(){}
    static void pat_6(){}
    static void pat_7(){}
    static void pat_8(){}
    static void pat_9(){}
    static void pat_10(){}
    static void pat_11(){}
    static void pat_12(){}
    static void pat_13(){}
    static void pat_14(){}
    static void pat_15(){}
    static void pat_16(){}
    static void pat_17(){}
    static void pat_18(){}
    static void pat_19(){}
    static void pat_20(){}
    static void pat_21(){}
    static void pat_22(){}
    static void pat_23(){}
    static void pat_24(){}
    static void pat_25(){}
    static void pat_26(){}
    static void pat_27(){}
    static void pat_28(){}
    static void pat_29(){}
    static void pat_30(){}
    static void pat_31(){}
    static void pat_32(){}
    static void pat_33(){}
    static void pat_34(){}
    static void pat_35(){}
    static void pat_36(){}
    static void pat_37(){}
    static void pat_38(){}
    static void pat_39(){}
    static void pat_40(){}
    static void pat_41(){}
    static void pat_42(){}
    static void pat_43(){}
    static void pat_44(){}
    static void pat_45(){}
    static void pat_46(){}
    static void pat_47(){}
    static void pat_48(){}
    static void pat_49(){}
    static void pat_50(){}
    static void pat_51(){}
    static void pat_52(){}
    static void pat_53(){}
    static void pat_54(){}
    static void pat_55(){}
    static void pat_56(){}
    static void pat_57(){}
    static void pat_58(){}
    static void pat_59(){}
    static void pat_60(){}
    static void pat_61(){}
    static void pat_62(){}
    static void pat_63(){}
    static void pat_64(){}
    static void pat_65(){}
    static void pat_66(){}
    static void pat_67(){}
    static void pat_68(){}
    static void pat_69(){}
    static void pat_70(){}
    static void pat_71(){}
    static void pat_72(){}
    static void pat_73(){}
    static void pat_74(){}
    static void pat_75(){}
    static void pat_76(){}
    static void pat_77(){}
    static void pat_78(){}
    static void pat_79(){}
    static void pat_80(){}
    static void pat_81(){}
    static void pat_82(){}
    static void pat_83(){}
    static void pat_84(){}
    static void pat_85(){}
    static void pat_86(){}
    static void pat_87(){}
    static void pat_88(){}
    static void pat_89(){}
    static void pat_90(){}
    static void pat_91(){}
    static void pat_92(){}
    static void pat_93(){}
    static void pat_94(){}
    static void pat_95(){}
    static void pat_96(){}
    static void pat_97(){}
    static void pat_98(){}
    static void pat_99(){}
    static void pat_100(){}
    static void pat_101(){}
    static void pat_102(){}
    static void pat_103(){}
    static void pat_104(){}
    static void pat_105(){}
    static void pat_106(){}
    static void pat_107(){}
    static void pat_108(){}
    static void pat_109(){}
    static void pat_110(){}
    static void pat_111(){}
    static void pat_112(){}
    static void pat_113(){}
    static void pat_114(){}
    static void pat_115(){}
    static void pat_116(){}
    static void pat_117(){}
    static void pat_118(){}
    static void pat_119(){}
    static void pat_120(){}
    static void pat_121(){}
    static void pat_122(){}
    static void pat_123(){}
    static void pat_124(){}
    static void pat_125(){}
    static void pat_126(){}
    static void pat_127(){}
    static void pat_128(){}
    static void pat_129(){}
    static void pat_130(){}
    static void pat_131(){}
    static void pat_132(){}
    static void pat_133(){}
    static void pat_134(){}
    static void pat_135(){}
    static void pat_136(){}
    static void pat_137(){}
    static void pat_138(){}
    static void pat_139(){}
    static void pat_140(){}
    static void pat_141(){}
    static void pat_142(){}
    static void pat_143(){}
    static void pat_144(){}
    static void pat_145(){}
    static void pat_146(){}
    static void pat_147(){}
    static void pat_148(){}
    static void pat_149(){}
    static void pat_150(){}
    static void pat_151(){}
    static void pat_152(){}
    static void pat_153(){}
    static void pat_154(){}
    static void pat_155(){}

}
