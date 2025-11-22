transactions = [120, -50, 300, -150, -20, 500]
total_income = 0
total_expenses = 0
current_balance = 0
for amount in transactions:
    current_balance += amount
    if amount > 0:
        total_income += amount
    elif amount < 0:
        total_expenses += abs(amount)
print(f"Общая сумма доходов: {total_income}")
print(f"Общая сумма расходов: {total_expenses}")
print(f"Общий баланс: {current_balance}")