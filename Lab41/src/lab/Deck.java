package lab;

import java.util.*;

public class Deck {
	private ArrayList<Card> unDealt = new ArrayList<Card>();
	private ArrayList<Card> Dealt = new ArrayList<Card>();
	
	public Deck(String[] ranks, String[]suits, int[] pointValues) {
		for(int rank = 0; rank <ranks.length; rank++) {
			for(int suit = 0; suit <suits.length; suit++) {
				Card card = new Card(ranks[rank], suits[suit], pointValues[rank]);
				this.unDealt.add(card);
			}				
		}
	}
	
	public boolean isEmpty() {
		return (this.size() == 0);
	}
	
	public int size() {
		return this.unDealt.size();
	}
	
	public Card deal() {
		if(this.isEmpty()) {
			return null;
		}
		else {
			this.Dealt.add(this.unDealt.get(this.size()-1));
		}
		return this.unDealt.remove(this.size()-1);
	}
	
	public void shuffle() {
		for(int k = this.size()-1; k >= 0; k++){
			int r = (int) (Math.random()*k+1);
			swap(this.unDealt,k,r);
		}
		}
		
	public static void swap(ArrayList<Card> a, int i, int j) {
		Card temp = a.get(i);
		a.set(i,a.get(j));
		a.set(j, temp);
	}
	
}
