from OpenGL.GL import *
from OpenGL.GLUT import *
from OpenGL.GLU import *

def drawPoint(x, y):
    glBegin(GL_POINTS)
    glVertex2f(x, y)
    glEnd()
def midPointCircleDraw(cx, cy, r):
    x = r
    y = 0
    drawPoint(x + cx, y + cy)

    if (r > 0):
        drawPoint(x + cx, -y + cy)
        drawPoint(y + cx, x + cy)
        drawPoint(-y + cx, x + cy)
    p = 1-r
    while x>y:
        y += 1
        if p <= 0:
            p =p+2*y+1
        else:
            x -= 1
            p = p+2*y-2*x+1

        drawPoint(x + cx, y + cy)
        drawPoint(-x + cx, y + cy)
        drawPoint(x + cx, -y + cy)
        drawPoint(-x + cx, -y + cy)
        drawPoint(y + cx, x + cy)
        drawPoint(-y + cx, x + cy)
        drawPoint(y + cx, -x + cy)
        drawPoint(-y + cx, -x + cy)



def drawCircle():
    midPointCircleDraw(150,250, 30)
    midPointCircleDraw(180,250, 30)
    midPointCircleDraw(210,250, 30)
    midPointCircleDraw(240,250, 30)
    midPointCircleDraw(270,250, 30)
    midPointCircleDraw(300,250, 30)
    midPointCircleDraw(330,250, 30)

    midPointCircleDraw(170, 280, 30)
    midPointCircleDraw(200, 310, 30)
    midPointCircleDraw(230, 340, 30)
    midPointCircleDraw(260, 370, 30)
    midPointCircleDraw(290, 400, 30)
    midPointCircleDraw(320, 430, 30)

    midPointCircleDraw(350, 430, 30)
    midPointCircleDraw(350, 390, 30)
    midPointCircleDraw(350, 350, 30)
    midPointCircleDraw(350, 310, 30)
    midPointCircleDraw(350, 270, 30)
    midPointCircleDraw(350, 230, 30)
    midPointCircleDraw(350, 190, 30)
    midPointCircleDraw(350, 150, 30)
    midPointCircleDraw(350, 110, 30)


def iterate():
    glViewport(0, 0, 500, 500)
    glMatrixMode(GL_PROJECTION)
    glLoadIdentity()
    glOrtho(0.0, 500, 0.0, 500, 0.0, 1.0)
    glMatrixMode(GL_MODELVIEW)
    glLoadIdentity()


def showScreen():
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT)
    glLoadIdentity()
    iterate()
    glColor3f(1.0, 0.0, 0.0)
    # call the draw methods here
    drawCircle()
    glutSwapBuffers()


glutInit()
glutInitDisplayMode(GLUT_RGBA)
glutInitWindowSize(500, 500)
glutInitWindowPosition(0, 0)
wind = glutCreateWindow(b"OpenGL Coding Practice")
glutDisplayFunc(showScreen)
glutIdleFunc(showScreen)
glutMainLoop()