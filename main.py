from CoinClass import Coin
from D6Class import D6

#make a coin object
coin = Coin()

#flip the coin
num = coin.coinFlip();

#tell if heads or tails
if (num == 1):
	print("Coin: Heads " + str(num));
else:
	print("Coin: Tails");

#roll d6
d6 = D6()
num = d6.rollD6();
print("D6: " + str(num));

