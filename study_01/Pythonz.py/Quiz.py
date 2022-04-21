with open('vocabulary.txt', 'r') as vo:
    
    for line in vo:
        
        new_line = line.strip()
        answer = new_line.split(": ")[0]
        result = new_line.split(": ")[1]
        
        your_answer = input(result + ": ")
        
        
        if your_answer == answer:
            print("맞았습니다!\n")
        else:
            print(f"아쉽습니다. 정답은 {answer}입니다.\n")
        