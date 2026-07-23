"# Graphic_2" 
# Computer Graphics Algorithms (Java)

A collection of fundamental **Computer Graphics Algorithms** implemented in Java as part of a Computer Graphics course. The project demonstrates classic raster graphics algorithms for drawing lines and circles.

## Implemented Algorithms

### 1. Digital Differential Analyzer (DDA)

Implements the DDA algorithm for line drawing.

#### Features

- Reads start and end points.
- Calculates line slope.
- Computes every intermediate point.
- Displays each drawing step.
- Shows rounded pixel coordinates.

Example:

```
Start Point : (2,3)
End Point   : (8,7)

Step 1
xp = 2.0
yp = 3.0

Rounded Pixel:
(2,3)
```

---

### 2. Midpoint Circle Algorithm

Implements the Midpoint Circle Drawing Algorithm.

#### Features

- Draws a circle using the midpoint decision parameter.
- Calculates the first octant.
- Uses symmetry to generate all circle points.
- Displays the points of all four quadrants.

Example Output

```
(0,8)
(1,8)
(2,8)
(3,7)
...
```

---

### 3. Circle Visualization

Uses **JavaFX ScatterChart** to visualize the generated circle.

Features:

- Displays the calculated points.
- Shows all circle quadrants.
- Visual representation of the Midpoint Circle Algorithm.

---

## Technologies

- Java
- JavaFX
- Scanner
- Object-Oriented Programming

---

## Project Structure

```
ComputerGraphics/
│
├── TaskofGraphic/
│   └── DDA Algorithm
│
├── Task2ofGraphic/
│   └── Improved DDA Algorithm
│
├── Task3_graphic/
│   ├── Midpoint Circle Algorithm
│   └── JavaFX Circle Visualization
│
└── README.md
```

---

## Algorithms Covered

- Digital Differential Analyzer (DDA)
- Midpoint Circle Algorithm
- Circle Symmetry
- Pixel Rasterization

---

## Learning Objectives

This project demonstrates:

- Line Drawing Algorithms
- Circle Drawing Algorithms
- Raster Graphics
- JavaFX Visualization
- Mathematical Graphics Algorithms
- Coordinate Geometry

---

## How to Run

Compile the project:

```bash
javac *.java
```

Run one of the algorithms:

```bash
java TaskofGraphic
```

or

```bash
java Task2ofGraphic
```

or

```bash
java Task3_graphic
```

---

## Future Improvements

- Bresenham Line Algorithm
- Bresenham Circle Algorithm
- Ellipse Drawing Algorithm
- Polygon Filling
- Line Clipping (Cohen–Sutherland)
- Bezier Curves
- Interactive GUI
- Color Selection

---

## Author

Ahmed Walid Amin

