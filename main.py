from CoinClass import CoinClass

#make a coin object
coin = CoinClass()

#flip the coin
num = coin.coinFlip();
print(num);

#tell if heads or tails
if (num == 1):
	print("Heads");
else:
	print("Tails");
