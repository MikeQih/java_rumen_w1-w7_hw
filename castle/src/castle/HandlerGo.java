public class HandlerGo extends Handler {

    @Override
    public void doCmd(String word) {
        // TODO Auto-generated method stub
        game.goRoom(word);
    }
    public HandlerGo(Game game){
        super(game);
    }
    
}
