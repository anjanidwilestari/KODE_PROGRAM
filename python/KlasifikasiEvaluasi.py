import numpy as np
import matplotlib.pyplot as plt

#Klasifikasi
from sklearn.preprocessing import LabelBinarizer
from sklearn.neighbors import KNeighborsClassifier

x_train = np.array([
    [26, 8],
    [26, 11],
    [29, 8],
    [34, 10],
    [36, 11],
    [33, 8],
    [30, 9],
    [27, 10],
    [27, 11],
    [26, 11],
    [31, 13],
    [34, 8],
])

y_train = ['Go out', 'Go out', 'Go out', 'Stay at home', 'Stay at home', 'Go out', 'Go out', 'Go out', 'Go out', 'Go out', 'Stay at home', 'Go out']

x_test = np.array([
    [30, 10],
    [28, 13],
    [29, 9],
    [31, 12],
    [27, 8]
])

y_test = ['Stay at home', 'Go out', 'Go out', 'Stay at home', 'Go out']



lb=LabelBinarizer()
y_testbin = lb.transform(y_test)
print('\nLabel Biner : %s' % y_testbin.T[0])

k = 3
clf = KNeighborsClassifier(n_neighbors=k)
clf.fit(x_train, y_trainbin.reshape(-1))
pred_bin = clf.predict(x_test)
pred_label = lb.inverse_transform(pred_bin)
print(pred_label)


from sklearn.metrics import accuracy_score
print('akurasi: %s' % accuracy_score(y_testbin,pred_bin))


from sklearn.metrics import precision_score
print('presisi: %s' % precision_score(y_testbin,pred_bin))

from sklearn.metrics import recall_score
print('recall: %s' % recall_score(y_testbin,pred_bin))