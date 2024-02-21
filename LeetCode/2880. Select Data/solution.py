import pandas as pd

def selectData(students: pd.DataFrame) -> pd.DataFrame:
    df = pd.DataFrame(students[ students['student_id']==101 ][['name','age']] )
    return df