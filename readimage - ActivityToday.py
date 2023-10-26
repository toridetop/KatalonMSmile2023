from PIL import Image
import pytesseract

# Buka gambar
img = Image.open("C:\\Users\\08093761\\Katalon Studio\\Msmile\\Images\\ss1.png")

pytesseract.pytesseract.tesseract_cmd = 'C:\\Users\\08093761\\AppData\\Local\\Programs\\Tesseract-OCR\\tesseract.exe'

# Gunakan pytesseract untuk melakukan OCR pada gambar
text = pytesseract.image_to_string(img)

# Tampilkan hasil
print(text)
