import json

def read(path):
    data ={"data":""}
    with open(path, 'r') as f:
        data["data"] = f.read()
    return json.dumps(data)
    
