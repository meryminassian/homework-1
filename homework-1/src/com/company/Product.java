package com.company;
/* 2. Design a class Product containing counts of both upvotes and downvotes,
return what vote count should be displayed.
This is calculated by subtracting the number of downvotes from upvotes.

Note: You can expect only positive integers for vote counts.*/
public class Product {
    private int upvotes;
    private int downvotes;

    public Product(){}

    public Product(int upvotes, int downvotes) {
        //if(upvotes>=0 && downvotes>=0) {
            this.upvotes = upvotes;
            this.downvotes = downvotes;
        //}
    }

    public int getUpvotes() {
        return upvotes;
    }

    public void setUpvotes(int upvotes) {
        //if(upvotes >= 0)
            this.upvotes = upvotes;
    }

    public int getDownvotes() {
        return downvotes;
    }

    public void setDownvotes(int downvotes) {
        //if(downvotes >= 0)
            this.downvotes = downvotes;
    }

    public int getVoteCount(){
        if(upvotes>=0 && downvotes>=0)
            return (upvotes - downvotes);
        else {
            System.out.println("both upvotes and downvotes should be non negative");
            return 0;
        }
    }
}
