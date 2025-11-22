files = ["song.mp3", "video.mp4", "track.mp3", "image.jpg"]
mp3_files = []
for file_name in files:
    if file_name.endswith(".mp3"):
        mp3_files.append(file_name)
print(mp3_files)