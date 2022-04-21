from pickle import FALSE

with open('vocabulary.txt', 'w') as f:

    while True:
        Eng = input("영어 단어를 입력하세요: ")
        if Eng == "exit":
            break;      
        
        f.write(Eng + ": ")
        
        Kor = input("한국어 뜻을 입력하세요: ")
        if Kor == "exit":
            break;  
        
        f.write(Kor + "\n")
