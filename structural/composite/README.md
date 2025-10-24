# Composite
The Composite design pattern is a structural pattern that allows you to compose objects into tree-like structures to represent part-whole hierarchies. It lets clients treat individual objects and compositions of objects uniformly.

Key Concepts
Component: An interface or abstract class that declares common operations for both simple (Leaf) and complex (Composite) objects in the composition.
Leaf: A basic object that doesn't have children. It implements the Component interface and defines the behavior for primitive objects in the composition.
Composite: An object that has child components (either Leaves or other Composites). It implements the Component interface and delegates operations to its children.
Analogy: File System
A good analogy is a file system:

A file is a Leaf object. It has content but cannot contain other files or directories.
A directory is a Composite object. It can contain files (Leaf objects) and other directories (Composite objects).
