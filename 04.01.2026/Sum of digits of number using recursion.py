def sum_of_digits(n):
    return n if n < 10 else (n % 10) + sum_of_digits(n // 10)

print(sum_of_digits(1234))  # Output: 10
