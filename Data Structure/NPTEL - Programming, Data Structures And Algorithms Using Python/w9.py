import networkx as nx
G=nx.gnp_random_graph(100,1)
print(nx.is_connected(G))
