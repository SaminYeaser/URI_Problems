a = float(input())
tax1 = 0.0
tax2 = 0.0
tax3 = 0.0
if a <= 2000.00:
    print('Isento')
elif a >= 2000.01 and a <= 3000.00:
    tax1 = (a - 2000) * (8/100)
    print("{:.2f}".format(tax1))
elif a>=3000.01 and a <= 4500.00:
    tax1 = 1000.00 * (8/100)
    tax2 = (a - 3000) * (18/100)
    tax1 = tax1 + tax2
    print("{:.2f}".format(tax1))
elif a>=4500.00:
    tax1 = 1000.00 * (8/100)
    tax2 = 1500 * (18/100)
    tax3 = (a-4500) *(28/100)
    tax1 = tax1 + tax2 + tax3
    print("{:.2f}".format(tax1))

