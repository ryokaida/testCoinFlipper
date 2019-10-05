import random

class D6:
	
	#method to roll a d6
	#@return num the result of the roll (1-6)
	def rollD6(self):
		num = random.randint(1,6);
		return num;
