#!/usr/bin/env python2.7

"""Set up an environment and launch the Hy handler."""

import sys
import os.path
sys.path.append(os.path.join(os.path.dirname(__file__),
                             'venv/lib/python2.7/site-packages'))

import main
app = main.app
