package CardDeck;

public class DeckEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Deck의 생성자를 호출하면 항상, 포함된 클래스부터 생성을 먼저함 (중요)
	Deck d = new Deck();	
    Card c = d.pick(0);
    
    System.out.print("카드 섞기 전에 제일 위에 있는 카드");
    System.out.println(c.toString());
	
    d.shuffle();
    
    c = d.pick(51);
	System.out.println("카드 섞은 후 제일 밑에 있는 카드");
	System.out.println(c.toString());
	
	 c = d.pick();
		System.out.println("임의로 뽑은 카드");
		System.out.println(c.toString());
	}

}
