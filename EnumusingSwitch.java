package first;
enum Bikes{honda,hero,yahama,apache,java,bajaji,bmw,suzuki,TVS}

public class EnumusingSwitch {

	public static void main(String[] args) {
		
		Bikes b;
		b=Bikes.hero;
		switch(b)
		{
		case honda:
			System.out.println("hurray!you have chosen Honda!");
			break;
		case hero:
			System.out.println("hurray!you have chosen hero!");
			break;
		case yahama:
			System.out.println("hurray!you have chosen yahama!");
			break;
			
		case bajaji:
			System.out.println("hurray!you have chosen bajaji!");
			break;
		case bmw:
			System.out.println("hurray!you have chosen bmw!");
			break;
		case suzuki:
			System.out.println("hurray!you have chosen suzuki!");
			break;
		case TVS:
			System.out.println("hurray!you have chosen TVS!");
			break;
			default:
				System.out.println("hurray!you have not chosen in the list ");
		}
	}

}
