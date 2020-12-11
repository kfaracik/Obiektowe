# Generator ewolucji

## Wprowadzenie

Projekt ma na celu nauczyć podejścia obiektowego przy tworzenia aplikacji w języku Java.

## Cel projektu
Stwórzmy grę! Nie będzie to jednak gra, w którą my gramy. Zamiast tego będzie to świat, który ewoluuje na naszych oczach! Stworzymy środowisko stepów i dżungli ze zwierzętami, które biegają, buszują w zaroślach, jedzą i rozmnażają się. A po kilka milionach lat zobaczymy, że wyewoluowały w różne gatunki!

Świat naszej gry jest niezmiernie prosty. Składa się ze zwykłej, prostokątnej połaci, której brzegi zawijają się na drugą stronę. Większość świata pokrywają stepy, na których rośnie niewiele roślin stanowiących pożywienie zwierząt. Na środku świata znajduje się niewielka dżungla, gdzie rośliny rosną dużo szybciej.


## Technologie
* Java
* JavaFx
* Libki...

## Uruchomienie
Do uruchomienia potrzebne jest oprogramowanie java 15.

## Przykłady użycia
...

## Status projektu
### TODO:

#### Tworzenie projektu
- [ ] Wygeneruj mapę
    - [x] ```step``` jako prostokąt ```a * b```
    - [x] ```sawanna``` na środku ```sqrt(a) * sqrt(b)```
    - [ ] unikaj kolizji przy pierwszym dodawaiu zwierząt - zmnień pozycję rośliny
    - [ ] trawa pojawia się w turach
    - [ ] zawija się na krańcach dla 8 kierunków świata
    
- [x] Tury - zwierzę może ruszyć się tylko raz w ciągu dnia
  
- [ ] Generator codziennego dodawania roślin
  - [ ] 1 na ```sawannie```
  - [ ] 1 na ```stepie```
    
- [ ] Poziom życia zwierząt
  - [ ] Każdego dnia zwierze traci określoną ilość ```energii```
    
- [ ] Genetyka zwierząt
- [ ] Generator ruchów zwierząt
  - [ ] Każdy ruch zużywa energie
    
- [ ] 8 obrotów (stron świata)
- [ ] Rozmnażanie i umieranie zwierzaków
- [ ] Testy
- [ ] Symulacja
- [ ] Statystyki - wykres

#### Optymalizacja:
- [ ] w przypadku gy zapełnimy 60% mapy to patrzymy na "wolne pozycje"
- [ ] problem wielowątkowości albo rysujemy albo obliczamy - synchronizacja/ przekaywanie inforami pomiędzy wątkami
   
#### Grafika:
- [ ] java fx
- [ ] (opcjonalnie swing)

Opcjonalinie: Gdy zwierze jest otoczone przez rośliny to uruchamiamy "rozglądanie"
 zwierze traci energie podczas rozglądania


# Źródła:
```https://github.com/apohllo/obiektowe-lab/tree/master/lab8```