#Измените значение "status": "active" на "inactive".
user_status = {
    "user_id": 101,
    "username": "Alex",
    "status": "active",
    "last_login": "2025-12-01"
}
print("--- До изменения ---")
print(user_status)
print(f"Текущий статус: {user_status['status']}")
user_status["status"] = "inactive"
print("\n--- После изменения ---")
print(user_status)
print(f"Новый статус: {user_status['status']}")