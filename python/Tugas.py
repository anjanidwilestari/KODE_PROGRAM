file = open('orange.txt','r')
read=file.readlines()
modified = []

for line in read:
        modified.append(line.strip())

#print(modified)

from sklearn.feature_extraction.text import TfidfVectorizer
import pandas as pd

vectorizer = TfidfVectorizer(stop_words='english')
response = vectorizer.fit_transform(modified)
#print(response)

token = vectorizer.get_feature_names_out()
#print(token)

df = pd.DataFrame(
    response.todense(),
    columns=vectorizer.get_feature_names_out()
)

print(df.transpose())
