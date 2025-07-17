// Sort Cities by Population
// The program must accept the names of N cities as the input. The number of men and women in each city are also passed as the input.

// The program must sort the cities in descending order based on:

// Total population (men + women)

// If total population is the same, then by number of men (descending)

// If both are the same, then by city name (lexicographical order)
// Your task is to define the class City so that the program runs successfully.

// Example Input/Output 1:
// Input:
// 5
// KRRCity 4000 3500
// HTechCity 5000 3300
// MGGCity 3500 4000
// ABBCity 4000 3500
// YSKCity 3100 1900

// Output:
// HTechCity 5000 3300
// ABBCity 4000 3500
// KRRCity 4000 3500
// MGGCity 3500 4000
// YSKCity 3100 1900
// Explanation:
// Compute total population:
// HTechCity → 8300
// ABBCity, KRRCity → 7500
// MGGCity → 7500
// YSKCity → 5000
// Among cities with equal total:
// ABBCity vs KRRCity: same total, same men (4000), so sorted lexicographically → ABBCity before KRRCity
// MGGCity comes after them as it has fewer men (3500)

// 🧪 Example Input/Output 2:
// Input:
// 6
// RPCity 6200 5800
// SOGCity 1300 2100
// EKYCity 5000 8000
// GUDDCity 6200 5800
// EXLOCity 6500 5500
// MYNCity 2450 1950
// Output:
// EKYCity 5000 8000
// EXLOCity 6500 5500
// GUDDCity 6200 5800
// RPCity 6200 5800
// MYNCity 2450 1950
// SOGCity 1300 2100

import java.util.*;

class City implements Comparable<City> {
    String name;
    int men, women, total;

    City(String name, int men, int women) {
        this.name = name;
        this.men = men;
        this.women = women;
        this.total = men + women;
    }

    @Override
    public int compareTo(City other) {
        if (this.total == other.total && this.men == other.men) {
            return this.name.compareTo(other.name); // sort by name
        } else if (this.total == other.total) {
            return Integer.compare(other.men, this.men); // more men first
        } else {
            return Integer.compare(other.total, this.total); // more total first
        }
    }

    @Override
    public String toString() {
        return this.name + " " + this.men + " " + this.women;
    }
}

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine().trim());
        List<City> cities = new ArrayList<>();

        for (int ctr = 1; ctr <= N; ctr++) {
            String currCity[] = sc.nextLine().trim().split("\\s+");
            cities.add(new City(
                currCity[0],
                Integer.parseInt(currCity[1]),
                Integer.parseInt(currCity[2])
            ));
        }

        Collections.sort(cities);
        for (City city : cities) {
            System.out.println(city);
        }
        sc.close();
    }
}
