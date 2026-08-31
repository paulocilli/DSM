def dividir(a, b):
    # ⚠️ BUG: Divisão por zero explícita se b for zero
    return a / b 

def processar_dados():
    total = 0
    # ⚠️ BUG / LOOP INFINITO: Condição de parada ausente
    while total >= 0: 
        print("Processando...")
```[cite: 1]
