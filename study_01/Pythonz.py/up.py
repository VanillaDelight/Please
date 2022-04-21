import random

vocab = {}

with open('vocabulary.txt', 'r') as vo:
    for line in vo:
        data = line.strip().split(": ")
        english_word, korean_word = data[0], data[1]
        vocab[english_word] = korean_word
        
    keys = list(vocab.keys())
        
    while True:
            
        index = random.randint(0, len(keys) - 1)
        english_word = keys[index]
        korean_word = vocab[english_word]
            
        guess = input(korean_word + ": ")
        
        if guess == 'q':
            break
        
        if guess == english_word:
            print("정답입니다!\n")
        else:
            print(f"아쉽습니다. 정답은 {english_word}입니다.\n")