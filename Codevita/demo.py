def main():
    n = int(input())
    input_list = []
    for i in range(n):
        input_list.append(input())

    for i in range(n):
        data = input_list[i].split()
        if len(data) < 2:
            print("Invalid")
            break

        number = data[0]
        name = data[1]
        password = generate_password(number, name)
        print(password)

def generate_password(number, name):
    try:
        num = float(number)
        scientific_notation = "{:.7E}".format(num)
        parts = scientific_notation.split("E")
        mantissa = parts[0]
        exponent = parts[1]

        d = reducing_number(mantissa[0])
        m = reducing_number(mantissa[mantissa.index('.') + 1:])
        e = reducing_number(exponent)

        s1 = get_s1(d, m, e)
        s2 = get_s2(name, e)

        return s1 + "@" + s2
    except ValueError:
        return "Invalid"

def reducing_number(value):
    num = int(value)

    while num > 9:
        sum = 0
        while num > 0:
            sum += num % 10
            num //= 10
        num = sum

    return num

def get_s1(d, m, e):
    digit_names = ["zer", "one", "two", "thr", "fou", "fiv", "six", "sev", "eig", "nin"]
    s1 = digit_names[abs(d)][0:3]
    s2 = digit_names[abs(m)][0:3]
    s3 = digit_names[abs(e)][0:3]

    if e < 0:
        s3 = "-" + s3
    elif e > 0:
        s3 = "+" + s3

    return s1 + "." + s2 + "e" + s3

def get_s2(name, e):
    s2 = ""
    e = abs(e)
    e = e % 10
    if e % 2 == 1:
        for i in range(len(name)):
            if i % 2 == 0:
                s2 += name[i][0:3]
    else:
        for i in range(len(name)):
            if i % 2 != 0:
                s2 += name[i][0:3]

    return s2

if __name__ == "__main__":
    main()