files = ["readme.md", "text.txt", "photo.png", "config.json", "app.py", "logo.jpg"]
image_extensions = ('.png', '.jpg')
text_extensions = ('.md', '.txt', '.json', '.py')
images_list = []
text_files_list = []
for file_name in files:
    if file_name.endswith(image_extensions):
        images_list.append(file_name)
    elif file_name.endswith(text_extensions):
        text_files_list.append(file_name)
print(f"Изображения: {images_list}")
print(f"Текстовые файлы: {text_files_list}")