from OpenGL.GL import *
from OpenGL.GLUT import *
from OpenGL.GLU import *


def iterate():
    glViewport(0, 0, 500, 500)
    glMatrixMode(GL_PROJECTION)
    glLoadIdentity()
    glOrtho(0.0, 500, 0.0, 500, 0.0, 1.0)
    glMatrixMode (GL_MODELVIEW)
    glLoadIdentity()
def DrawLines():
    glBegin(GL_LINES)
    glVertex2f(100,400)
    glVertex2f(150,400)
    glVertex2f(100,350)
    glVertex2f(150,350)
    glVertex2f(100,300)
    glVertex2f(150,300)
    glVertex2f(100,400)
    glVertex2f(100,300)
    glVertex2f(150,400)
    glVertex2f(150,300)

    glVertex2f(250,400)
    glVertex2f(250,300)
    glVertex2f(200,350)
    glVertex2f(250,350)
    glVertex2f(250,400)
    glVertex2f(200,350)

    glEnd()


def showScreen():
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT)
    glLoadIdentity()
    iterate()
    glColor3f(1.0, 0.0,0.0)
    #call the draw methods here
    DrawLines()
    glutSwapBuffers()

glutInit()
glutInitDisplayMode(GLUT_RGBA)
glutInitWindowSize(500, 500)
glutInitWindowPosition(0, 0)
wind = glutCreateWindow(b"OpenGL Coding Practice")
glutDisplayFunc(showScreen)
glutIdleFunc(showScreen)
glutMainLoop()