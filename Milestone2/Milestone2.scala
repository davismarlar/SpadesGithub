package milestone2

import org.scalatest.FunSpec
import org.scalatest.Matchers

class Milestone2 extends FunSpec with Matchers {
	describe("A Deck") {
		it("should conain 52 cards") { fail }
		it("should have a different top card once shuffled") { fail }
		it("should contain 13 clubs") { fail }
		it("should contain 13 hearts") { fail }
		it("should contain 13 diamonds") { fail }
		it("should contain 13 spades") { fail }
		it("should have 4 'A's") { fail }
		it("should have 4 '2's") { fail }
		it("should have 4 '3's") { fail }
		it("should have 4 '4's") { fail }
		it("should have 4 '5's") { fail }
		it("should have 4 '6's") { fail }
		it("should have 4 '7's") { fail }
		it("should have 4 '8's") { fail }
		it("should have 4 '9's") { fail }
		it("should have 4 '10's") { fail }
		it("should have 4 'J's") { fail }
		it("should have 4 'Q's") { fail }
		it("should have 4 'K's") { fail }
	}
  
  describe ("A Player") {
     describe("initial/ready-to-play-state"){
       it("has a hand full of 13 cards") {fail}
       it("can place a bid based on the thirteen cards") {fail}
       it("has a score of") {fail}
       it("can select a card if it is their turn") {fail}
     }
     
     describe("once first turn is complete") {
       it("has twelve cards left in hand") {fail}
       
         describe("if hand was lost"){
           it("has a score of 0") {fail}
           it("can make a legal move") {fail}
         }
         
         describe("if hand was won"){
           it("can select a card") {fail}
           it("has a score based on tricks bid") {fail}
         }
     }
     
     describe("during normal gameplay"){
       it("has between 1 and 12 cards in hand, inclusive") {fail}
       it("can select a legal card when it is players turn") {fail}
       it("has a score") {fail}
       it("will select a spade if out of the suit being played and teammate does not have the lead in the hand") {fail}
       it("will waste the highest possible card if out of suit being played and bid was NIL") {fail}
     }
  }
  
  describe("A Round"){
    describe("the first Round"){
      it("will select a player at random to be dealt the first card and start the round") {fail}
      it("will display each team's score as 0") {fail}
      it("will contain 13 turns") {fail}
      it("displays each player's bid") {fail}
    }
    
    describe("a round after the first"){
      it("will shuffle and deal the cards starting with the player to the logical right of the player who started the last round") {fail}
      it("will give thirteen cards to each player") {fail}
      it("displays each players bid") {fail}
      it("will display each teams score") {fail}
      it("will contain 13 turns") {fail}
      it("starts with the player who recieved the first card") {fail}
      it("can display the number of turns won by each player at any point") {fail}
    }

  }
  
  describe("A Turn"){
      describe("first turn of the round") {
        it("has a value of 1") {fail}
        it("starts with the player who was dealt the first card") {fail}
        it("decides a winner after all four players have played a card") {fail}
      }
      
      describe("any turn"){
        it("starts with the player who won the previous turn") {fail}
        it("can determine a winner") {fail}
        it("has a dominating suit after first move") {fail}
      }
  }
  
  describe("A Move"){
    describe("first move of a turn") {
      it("can select any card") {fail}
    }
    
    describe("2nd,3rd, or 4th move of a turn"){
      it("plays best card of the dominating suit") {fail}
      it("plays a spade if dominating suit is not in hand") {fail}
      it("plays highest offsuit card if bid is Nil and dominating suit is not in hand") {fail}
    }
  }
}