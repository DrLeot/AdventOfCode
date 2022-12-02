package Day_2;

public final class Battle {

    private final Hand a;
    private final Hand b;

    public Battle(String a, String b, boolean promode){
        this.a = Hand.valueOf(a);

        if(promode){
            if(b.equals("X")){ // need to lose
                if(this.a.getValue() == 1){
                    this.b = Hand.Z;
                    return;
                }
                if(this.a.getValue() == 2){
                    this.b = Hand.X;
                    return;
                }
                if(this.a.getValue() == 3){
                    this.b = Hand.Y;
                    return;
                }
            }

            if(b.equals("Y")){ // need draw
                this.b = this.a;
                return;
            }

            // need win
            if(this.a.getValue() == 1){
                this.b = Hand.Y;
                return;
            }
            if(this.a.getValue() == 2){
                this.b = Hand.Z;
                return;
            }
            if(this.a.getValue() == 3){
                this.b = Hand.X;
                return;
            }
        }else{
            this.b = Hand.valueOf(b);
            return;
        }

        this.b = this.a;
    }


    public int getResult(){
        // draw
        if(this.a.getValue() == this.b.getValue()){
            return 3 + this.b.getValue();
        }
        // win
        if(this.a.getValue() == 1 && this.b.getValue() == 2 ||
            this.a.getValue() == 2 && this.b.getValue() == 3 ||
            this.a.getValue() == 3 && this.b.getValue() == 1){

            return 6 + this.b.getValue();
        }

        // lose
        return this.b.getValue();
    }
}
