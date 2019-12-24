# snakeAndLadderGame
Game of Snake And Ladder

This game is for 3 players (hard coded input for better understanding).

Rule:
-> Every rule is same as normal Snake and Ladder Game.
-> If any player gets 3 continuous 6s, then he/she will loose that chance.
-> Player who reaches the 100th box first will be the winner. 
-> Only 1 winner will be there, and the game will end once any player wins the game.



# Will be improved further for:
  -> random snakes and ladder position.
  -> More than 1 dice to roll at a time.


# There was some error while adding file to git. So, I have added all the files in the main folder only. Describing them below:
  -> "pojo" package should contain files:
                -> Board.java
                -> Ladder.java
                -> Player.java
                -> Snake.java
          
  -> "srvices"package should contain:
                -> DiceRollingService.java
                -> GameService
                
  -> "onstants" ackage should contain:
                -> GlobalConstants.java
                
  -> Main should be outside all the above packages.
