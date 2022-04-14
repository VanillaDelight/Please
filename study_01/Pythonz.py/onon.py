import random

ANSWER = random.randint(1, 20)
NUM_TRIES = 4
# print(ANSWER)
guess = -1
tries = 0

while guess != ANSWER and tries < NUM_TRIES:
    
    guess = int(input(f"기회가 {NUM_TRIES - tries}번 남았습니다. 1-20 사이의 숫자를 맞혀 보세요:"))
    
    if guess > ANSWER:
        print("Down")
        
    else:
        print("Up")
        
    tries += 1
    
if guess == ANSWER:
    print(f"축하합니다. {tries}번 만에 숫자를 맞히셨습니다.")
        
else:
    print(f"아쉽습니다. 정답은 {ANSWER}입니다.")
