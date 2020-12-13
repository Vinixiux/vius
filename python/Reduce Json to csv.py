#!/usr/bin/env python
# coding: utf-8

# In[1]:


import json
import os

import numpy as np
import pandas as pd
from tqdm import tqdm


# In[2]:


data = {'business_id': [], 'stars': []}

with open('C:\\Users\\vinic\\Downloads\\yelp_academic_dataset_review.json', encoding="UTF-8") as f:
    for line in tqdm(f):
        review = json.loads(line)
        data['business_id'].append(review['business_id'])
        data['stars'].append(review['stars'])


# In[3]:


df = pd.DataFrame(data)

print(df.shape)
df.head()


# In[4]:


df['business_id'] = df['business_id'].astype(str)
df['stars'] = df['stars'].astype('category')


# In[7]:


df.to_csv('C:\\Users\\vinic\\Downloads\\yelp_academic_dataset_review.csv', index=False)


# In[9]:


pd.read_csv('C:\\Users\\vinic\\Downloads\\yelp_academic_dataset_review.csv')


# In[ ]:




