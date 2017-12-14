package lab;

public class Card {
		private String rank;	
		private String suit;
		private int pointValue;
		
		public Card(String rank, String suit, int pointValue) {
			this.rank = rank;
			this.suit = suit;
			this.pointValue = pointValue;
		}
		
		public boolean equals(Card otherCard) {
			if (this.pointValue == otherCard.pointValue) {
				return true;
			}
				return false;
		}
		
		
		public String getRank() {
			return rank;
		}

		public String getSuit() {
			return suit;
		}

		public int getPointValue() {
			return pointValue;
		}
		
		public String toString() {
			return "Card [rank=" + rank + ", suit=" + suit + ", pointValue=" + pointValue + "]";
		}

		
}
