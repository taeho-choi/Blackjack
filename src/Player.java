
public class Player {
	final static int MAX_CARDS = 52;
	public Card[] cards = new Card[MAX_CARDS];
	private int N = 0;
	private String name;
	public Player(String name) {
		this.name = name;
	}
	public int inHand() {
		return N; //�տ� �ִ� ī���� ����
	}
	public void addCard(Card c) {
		cards[N++] = c;
	}
	public void reset() {
		N=0;
	}
	public int value() { //���� ����ϴ� �޼ҵ�
		//ī�� ���ڸ� ���ϴ� �� Ace�� 1, 11 �� �� �ִ�.
		int result = 0; //����
		int Aces = 0;   //Ace ī�� �� ����
		for (int i=0; i<N; i++) {
			if (cards[i].getValue() == 1) {
				Aces ++;
				result += 11;
			}
			else
				result += cards[i].getValue();			
		}
		while (result > 21 && Aces > 0) {
			result -= 10;
			Aces --;
		}
		return result;
	}
}
