import random

def generate_numbers(n):
    num_list = []
    i = 0
    while i < n:
        rand = random.randint(1, 45)
        if rand in num_list:
            continue
        else:
            num_list.append(rand)
            i += 1
    return num_list


def draw_winning_numbers():
    new_list = sorted(generate_numbers(6))
    while True:
        bonus = random.randint(1, 45)
        if bonus not in new_list:
            bonus = bonus
            break
    new_list.append(bonus)
    return new_list


def count_matching_numbers(list_1, list_2):
    count = 0
    i = 0
    while i < len(list_1):
        j = 0
        while j < len(list_2):
            if list_1[i] == list_2[j]:
                count += 1
                break
            j += 1
        i += 1
    return count

                
def check(list_1, list_2):
    tmp = list(list_2)
    del tmp[6]
    count = count_matching_numbers(list_1, tmp)
    if count == 0 or count == 1 or count == 2:
        return ("낙첨입니다!")
    elif count == 3:
        return ("5등 : 5천원")
    elif count == 4:
        return ("4등 : 5만원")
    elif count == 5:
        if list_2[6] not in list_1:
            return ("3등 : 100만원")
        else:
            return ("2등 : 5천만원")
    else:
        return ("1등 : 10억원!")
                
             
        
        
        
        
        
        
            