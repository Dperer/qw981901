import java.util.Scanner;
public class Homework2A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入名字");
		String name = scn.next();
		System.out.println("Hi,"+name+"你好,歡迎來到亞大");
		System.out.print("請輸入職業");
		String work = scn.next();
		System.out.println("哇嗚,"+work+"你好厲害啊");
		System.out.print("您的興趣是");
		String interest = scn.next();
		System.out.println("哈哈，"+interest+"真是個有趣的嗜好");
		System.out.print("您來自哪裡呢");
		String from = scn.next();
		System.out.println("喔喔!"+from+"不太熟悉= =");
		System.out.print("那裡氣溫都幾度阿?(請您給個大概的攝氏溫度數字)");
		Float c = scn.nextFloat();
		Float f = c*9/5+32;
		System.out.println("華氏溫度為"+f+"我真厲害XD");
		System.out.print("對了請問您目前是單身嗎?");
		String love = scn.next();
		System.out.println(love+"，管你單身還是怎樣反正我有女朋友XD");
		System.out.print("哈哈，你現在有沒有想說甚麼呢?");
		String talk = scn.next();
		System.out.println(talk+"，不管您獎甚麼我都不想聽我要去放閃啦~88");

	}

}
