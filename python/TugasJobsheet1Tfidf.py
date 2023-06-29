#Kelompok4 (Anjani(06), Firgi(13), Ridho(26))

#Program Python TF-IDF

#Tahap Tokenizing
with open("orange.txt") as file:
    data = [line.rstrip('\n') for line in file]

print(f'Potongan Kalimat:\n {data}')

#Pembobotan TF-IDF
#pip install sklearn
from sklearn.feature_extraction.text import TfidfVectorizer

#pip install pandas
import pandas as pd

#Stopword removal mengeliminasi kata
vectorizer = TfidfVectorizer(stop_words='english')
response = vectorizer.fit_transform(data)
print(f'\nHasil output pembobotan TF-IDF:\n {response}')


#Menampilkan kumpulan token yang sudah di eliminasi stop_words (Tahap Stemming)
stemm = vectorizer.get_feature_names_out()
print(f'\nKata dasar:\n {stemm}')


#Transformasi ke bentuk array dengan menampilkan token dalam bentuk kolom
df = pd.DataFrame(
    response.todense(),
    columns=vectorizer.get_feature_names_out()
)

print(f'\nPembobotan Normalisasi:\n {df.transpose()}')




