import random

class Coin:
	
	#method to either get 1 or 2
	#@return num either 1 or 2
	def coinFlip(self):
		num = random.randint(1,2);
		return num;
