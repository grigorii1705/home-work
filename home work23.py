log = [
    "Info: start",
    "Error: file not found",
    "Warning: low memory",
    "Error: timeout"]
for line in log:
    if "Error" in line:
        print(line)