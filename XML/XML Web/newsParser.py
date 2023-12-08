import xml.etree.ElementTree as ET
import streamlit as st

tree = ET.parse('xml/news.xml')
root = tree.getroot()

for news in root.findall('item'):
    title = news.find("title").text
    st.header(title)
    st.image(news.find('enclosure').text)
    for i in news.find("ingredients"):
        st.text(i.get("title")+"->"+i.get("amount"))
    for s in news.find("steps"):
        st.text(s.text)
